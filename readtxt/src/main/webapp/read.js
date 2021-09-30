let req;
let isIE;

function initAJAX() {
    if(window.XMLHttpRequest) {
        req = new XMLHttpRequest();
    } else if(window.ActiveXObject) {
        isIE = true;
        req = ActiveXObject();
    }
}

function leTxt() {
    initAJAX();
    req.onreadystatechange = retornoAJAX;
    let obj1 = document.getElementById("txt-local");
    let obj2 = document.getElementById("txt-file");
    let url = "retornoajax?localfile=" + obj1.value + obj2.value;
    req.open("GET", url, true);
    req.send(null);
}

function retornoAJAX() {
    if(req.readyState === 4) {
        if(req.status === 200) {
            let elemXML = req.responseXML.documentElement;
            let retTitle = document.querySelector("title");
            let retObj1 = document.getElementById("first-line");
            let retObj2 = document.getElementById("second-line");
            retObj1.style.backgroundColor = $(elemXML).find("ajaxstyles").text().slice(18, 25);
            retObj2.style.backgroundColor = $(elemXML).find("ajaxstyles").text().slice(18, 25);
            retObj1.style.color = $(elemXML).find("ajaxstyles").text().slice(34, 41);
            retObj2.style.color = $(elemXML).find("ajaxstyles").text().slice(34, 41);
            retTitle.innerHTML = $(elemXML).find("ajaxtitle").text();
            retObj1.innerHTML = $(elemXML).find("ajaxlines").item(0).text();
            retObj2.innerHTML = $(elemXML).find("ajaxlines")[1].text();
        }
    }
}
