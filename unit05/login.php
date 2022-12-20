<html>
 <head>
 <title>Login</title>
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
 $password = $_POST['password'];
 $sql = "select * from users where username = '$username' and password = '$password'";
 $result = $conn->query($sql);
 
 if ($result->num_rows == 1) {
 $_SESSION['username'] = $username; 
 header("Location: dashboard.php");
 }
 else {
 echo "<h3>Incorrect Username/password.</h3><br/>
 <p>Click here to <a href='login.php'>Login</a> again.</p>";
 echo "<p>Click here to <a href='recover.php'>recover</a> password.</p>";
 }
 } else {
?>
 <form class="form" method="post" name="login">
 <center>
 <h1 >Login</h1> 
    <table>
        <tr>
            <td>username: </td>
            <td><input type="text"  name="username" /></td>
        </tr>
        <tr>
            <td>password: </td>
            <td><input type="password" name="password" /></td>
        </tr>
    </table>
 <input type="submit" value="Login" name="submit" /> <br>
 <p>Don't have an account? <a href="registration.php">Register Now</a></p>
 </center>
 </form>
<?php
 }
?>
</body>
</html> 