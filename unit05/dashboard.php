<?php
 session_start();
 if(!isset($_SESSION["username"])) {
 header("Location: login.php");
 exit();
 }
?>
<html>
 <head>
 <title>Dashboard - Client area</title>
 </head>
 <body>
 <center>
 <p>Hello, <?php echo $_SESSION['username']; ?>!</p>
 <p>You are in user dashboard page.</p>
 <p><a href="logout.php">Logout</a></p>
 </center>
 </body>
 </html> 
