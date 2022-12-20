<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Login</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>
<body>
    <?php
    if (isset($_POST['username'])) {
        $password = $_POST['password'];
        $username = $_POST['username'];
        echo "The username is: ", $username, ".<br>";
        echo "The password is: ", $password, ".<br>";
    }else{
    ?>

    <body>
    <form method="post" action="login.php">
        <table>
            <tr>
                <td>username</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>password</td>
                <td><input type="password" name="password"></td>
            </tr>
        </table>
        <input type="submit" value="login">
        <!-- <input type="submit" value="forgot password">
        <input type="submit" value="change password"> -->
    </form>
    <?php
    }
    ?>
</body>
</html>