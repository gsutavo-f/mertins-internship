function onlyNumberKey(evt) {
    let ASCIICode = (evt.which) ? evt.which : evt.keyCode
    if(ASCIICode > 31 && (ASCIICode < 48 || ASCIICode > 57))
        return false;
    return true;
}