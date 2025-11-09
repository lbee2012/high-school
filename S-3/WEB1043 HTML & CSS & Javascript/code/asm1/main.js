function validateForm() {
    document.getElementById("emailError").innerText = "";
    document.getElementById("passwordError").innerText = "";
    document.getElementById("confirmPasswordError").innerText = "";

    var email = document.getElementById(email).value;
    var password = document.getElementById(password).value;
    var confirmPassword = document.getElementById(confirmPassword).value;

    var check = true;

    var emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    var passwordPattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{6,}$/;

    if (!emailPattern.test(email)) {
        document.getElementById("emailError").innerText = "Email khong hop le";
        check = false;
    }
    
    if (!passwordPattern.test(password)) {
        document.getElementById("passwordError").innerText = "Password khong hop le";
        check = false;
    }
    
    if (password != confirmPassword) {
        document.getElementById("confirmPasswordError").innerText = "Mat khau khong trung khop";
        check = false;
    }

    return check;
}