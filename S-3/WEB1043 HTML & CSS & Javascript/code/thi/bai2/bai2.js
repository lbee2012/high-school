function validateForm() {
    document.getElementById("nameError").innerText = ""
    document.getElementById("emailError").innerText = ""
    document.getElementById("passwordError").innerText = ""
    document.getElementById("yearError").innerText = ""

    var name = document.getElementById('name').value
    var email = document.getElementById('email').value
    var password = document.getElementById('password').value
    var year = document.getElementById('year').value

    var check = true
    var emailCheck = /em ko nhớ mấy cái định dạnggggggg fheaowjfoawijfe/

    if (name == '') {
        document.getElementById('yearError').innerText = "Ho va ten trong";
        check = false;
    }

    if (!emailCheck.test(email)) {
        document.getElementById("emailError").innerText = "Email khong hop le"
        check = false;
    }

    if (password.length < 6) {
        document.getElementById('passwordError').innerText = "Mat khau phai co it nhat 6 ki tu";
        check = false;
    }

    if (year == '' || years < 1900 || years > 2024) {
        document.getElementById('yearError').innerText = "Nam sinh phai lon hon 1900 va nho hon 2024";
        check = false;
    }

    return check;
}