<!-- Develop student registration form and display all the submitted data on the page -->

<html>
<title>Student registration</title>
<h1>Student Registration Form </h1>
<body>
<form method=get action="">
Enter Student name:<input type=text name=t1 value="<?php if (isset($_GET['t1']))
    echo
        $_GET['t1']; ?>"></br>
Enter Student Roll no:<input type=text name=t2 value="<?php if (isset($_GET['t2']))
    echo
        $_GET['t2']; ?>"></br>
Enter Class:<input type=text name=t3 value="<?php if (isset($_GET['t3']))
    echo
        $_GET['t3']; ?>"></br>
Enter Age:<input type=text name=t4 value="<?php if (isset($_GET['t4']))
    echo
        $_GET['t4']; ?>"></br>
Enter Address:<input type=text name=t5 value="<?php if (isset($_GET['t5']))
    echo
        $_GET['t5']; ?>"></br>
<input type=submit value=submit></br>
</form>
</body>
</html>
<?php
$name = $_GET['t1'];
$roll = $_GET['t2'];
$class = $_GET['t3'];
$age = $_GET['t4'];
$add = $_GET['t5'];
if (isset($_GET['t1'])) {
    if ($name == "" || $roll == "" || $class == "" || $age == "" || $add == "") {
        echo "All fields are compulsory :";
    } else {
        
        echo "<h1>Student Information </h1></br>";
        echo "Student name :$name</br>";
        echo "Student Roll no: $roll</br>";
        echo "Student Class: $class</br>";
        echo "Student Age :$age</br>";
        echo "Student Address: $add</br>";
    }
}
?>
