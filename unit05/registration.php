<html>
<head>
 <title>Registration</title>
</head>
<body>
<?php
 $sname= "localhost";
 $uname= "root";
 $password = "";
 $conn = new mysqli($sname, $uname, $password,"LoginSystem");
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
 if (isset($_POST['username'])) {
 $username = $_POST['username'];
 $email = $_POST['email'];
 $password = $_POST['password'];
    $rc1 = $_POST['rc1'];
    $rc2 = $_POST['rc2'];
//  $sql = "INSERT into `users` (username, password, email) VALUES ('$username','$password', '$email')";
 $sql = "INSERT into users (username, password, email, rc1, rc2) VALUES ('$username','$password', '$email', '$rc1', '$rc2')";
//  $result = $conn->query($sql);
    $result = mysqli_query($conn, $sql);
 if ($result) {
 echo "<h3>You are registered successfully.</h3><br/>
 <p>Click here to <a href='login.php'>Login</a></p>";
 } else {
 echo "<h3>Required fields are missing.</h3><br/>
 <p class='link'>Click here to <a href='registration.php'>register</a> again.</p>";
 }
 } else {
    ?>
 <form action="" method="post">
<center>
 <h1>Registration</h1>

    <table>
        <tr>
            <td>username: </td>
            <td><input type="text" name="username"  required /></td>
        </tr>
        <tr>
            <td>email: </td>
            <td><input type="email" name="email" ></td>
        </tr>
        <tr>
            <td>password: </td>    
            <td><input type="password" name="password" ></td>
        </tr>
        <tr>
            <td>recovery question 1(favourite color): </td>    
            <td><input type="text" name="rc1" ></td>
        </tr>
        <tr>
            <td>recovery question 2(pet name): </td>    
            <td><input type="text" name="rc2" ></td>
        </tr>
        
    </table>
    
    <!-- <input type="text" name="username"  required /> <br><br>
    <input type="email" name="email" ><br><br>
    <input type="password" name="password" > <br><br> -->
 <input type="submit" name="submit" value="Register"> <br>
 <p>Already have an account? <a href="login.php">Login here</a></p>
 </center>
 </form>
<?php
 }
?>
</body>
</html>