<!doctype html>
<%@ page isELIgnored="false" %>

<html>
<head>
    <meta charset="utf-8">
    <title>Book Room</title>
    <link rel="stylesheet" href="style.css" type="text/css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Mukta:wght@200&display=swap" rel="stylesheet">
</head>
<body>
    <header id='header'>
        <div class='nav-bar'>
            <div class='nav-item'>

            </div>
            <div class='nav-item'>

            </div>
            <div class='nav-item'>

            </div>
            <div class='nav-item'>

            </div>
            <div class='nav-item'> 
            </div>
        </div>
    </header>
    <div class='container-login'>
        <h1>Book Room</h1>
        <form action="main-menu" method="post" name='login' class="login-form">
            <input type="hidden" name="action" value="login">
        
            <div class='container-mode'>
                <div id="login-mode-box" class='mode-box chosen' onclick='handleMode()' >Login</div>
                <div id="signup-mode-box" class='mode-box' onclick='handleMode()' >Signup</div>           
            </div>
            <div class="input-container">
                <input type="text" name="username" placeholder="Username" class="input-item" required>

                <input type="password" name="password" placeholder="Password" class="input-item" required>

                <input type="hidden" id="confirm-password" placeholder="Confirm Password" class="input-item">
                <a id="forgot-password" href="">Forgot password?</a>
            </div>
            <input type="submit" value="Login" class="submit" id='submit' >

            <p id="not-a-member">Not a member? <a href="#" onclick='handleMode()' id="signup-now">Signup now</a></p>
        </form>
    </div>
</body>
</html>
<script>
    let loginMode = "mode-box chosen";
    let signupMode = "mode-box";

    function handleMode() {
        if(event.target.id == "login-mode-box") {
            loginMode = "mode-box chosen";
            signupMode = "mode-box";
            document.getElementById("login-mode-box").classList = loginMode;
            document.getElementById("signup-mode-box").classList = signupMode;
            document.getElementById("confirm-password").type = "hidden";
            document.getElementById("submit").value = "Login";
            document.getElementById("forgot-password").style = "";
            document.getElementById("not-a-member").style = "";

        }
        if(event.target.id == "signup-mode-box" || event.target.id == "signup-now") {
            loginMode = "mode-box";
            signupMode = "mode-box chosen";
            document.getElementById("login-mode-box").classList = loginMode;
            document.getElementById("signup-mode-box").classList = signupMode;
            document.getElementById("confirm-password").type = "password";
            document.getElementById("submit").value = "SignUp";
            document.getElementById("forgot-password").style = "display: none";
            document.getElementById("not-a-member").style = "display: none";
        }
}
</script>
