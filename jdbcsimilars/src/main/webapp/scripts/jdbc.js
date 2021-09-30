let req;
let isIE;

function initAJAX() {
    if(window.XMLHttpRequest) {
        req = new XMLHttpRequest();
    } else if(window.ActiveXObject) {
        isIE = true;
        req = new ActiveXObjext();
    }
}

function pesquisaNome() {
    initAJAX();
    req.onreadystatechange = retornoAJAX;
    let obj = document.getElementById("txt-input");
    let url = "retornoajax?conteudo=" + obj.value;
    req.open("GET", url, true);
    req.send(null);
}

function retornoAJAX() {
    if(req.readyState === 4) {
        if(req.status === 200) {
            let elemXML = req.responseXML.documentElement;
            let objRet = document.getElementById("txt-nomes");
            objRet.innerHTML = elemXML.childNodes[0].nodeValue;
        }
    }
}