<!-- php program to create a table in MySQL -->
<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "KhatarnakWalaDatabase";

// Create a connection to MySQL
$conn = new mysqli($servername, $username, $password, $dbname);
// Check the connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
echo "<h3>Initiating Table Creation...";
// SQL query to create a table
$sql = "CREATE TABLE KHATARNAKTABLE (
 id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 name VARCHAR(50) NOT NULL,
 email VARCHAR(50) NOT NULL
)";
// Execute the query
if ($conn->query($sql) === TRUE) {
    echo "Table created successfully";
} else {
    echo "Error creating table: " . $conn->error;
}
// Close the connection
$conn->close();
?>