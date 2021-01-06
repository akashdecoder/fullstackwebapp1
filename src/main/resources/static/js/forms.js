document.getElementById("register").addEventListener("click", errorMsg);

function errorMsg() {
    var password = document.getElementById("password");
    var conf_password = document.getElementById("confirmPassword");
    var first_name = document.getElementById("firstname");
    var last_name = document.getElementById("lastname");
    var email = document.getElementById("email");
    var phone = document.getElementById("contact");
    var n = (password.value).localeCompare(conf_password.value);
    try{
        if(first_name && last_name && email && phone && password && conf_password) {
            if(n !== 0) {
                window.alert("Password Mismatch");
            } else {
                window.alert("Registration successful");
            }
        } else {
            window.alert("Empty Fields");
        }
    } catch (err) {
        window.alert(err)
    }
}