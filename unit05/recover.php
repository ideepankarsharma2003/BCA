<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>recover</title>
</head>
<body>
    <?php
 $sname= "localhost";
 $unmae= "root";
 $password = "";
 $conn = new mysqli($sname, $unmae, $password,"LoginSystem");
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
 session_start();
 if (isset($_POST['username'])) {
 $username = $_POST['username'];
 $rc1 = $_POST['rc1'];
 $rc2 = $_POST['rc2'];
 $password = $_POST['password'];
 $sql = "UPDATE users SET password = '$password' where rc1 = '$rc1' and rc2 = '$rc2'";
 
 
 if ($conn->query($sql)) {
            echo "Congrats password reset succesfully, <p>Click here to <a href='login.php'>Login</a> again with new password.</p>";
 }
 else {
 echo "<h3>Something went wrong -.-.</h3><br/>
 <p>Click here to <a href='login.php'>Login</a> again.</p>";
 echo "<p>Click here to <a href='recover.php'>recover</a> password.</p>";
 }
 } else {
?>
    <form action="" method="post">
        <table>
            <tr>
                <td>username: </td>
                <td><input type="text"  name="username" /></td>
            </tr>
            <tr>
                <td>(favourite color): </td>    
                <td><input type="text" name="rc1" ></td>
            </tr>
            <tr>
                <td>(pet name): </td>    
                <td><input type="text" name="rc2" ></td>
            </tr>
            <<tr>
                <td>new password: </td>    
                <td><input type="password" name="password" ></td>
            </tr>
        </table>
        <input type="submit" value="reset password">
    </form>
<?php
 }
?>
</body>
</html>