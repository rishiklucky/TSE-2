###### **1. Responsive Webpage (HTML + CSS)**



<!DOCTYPE html>

<html>

<head>

<style>

body { font-family: Arial; }

.container { display: flex; }

.box { flex: 1; padding: 20px; background: lightblue; margin: 5px; }



@media (max-width:600px) {

&#x20; .container { flex-direction: column; }

}

</style>

</head>

<body>



<div class="container">

&#x20; <div class="box">Box 1</div>

&#x20; <div class="box">Box 2</div>

</div>



</body>

</html>



###### **2. Registration Form with Validation:**



<!DOCTYPE html>

<html>

<body>



<form onsubmit="return validate()">

&#x20; Name: <input type="text" id="name"><br>

&#x20; Email: <input type="text" id="email"><br>

&#x20; <input type="submit">

</form>



<script>

function validate() {

&#x20; let name = document.getElementById("name").value;

&#x20; let email = document.getElementById("email").value;



&#x20; if (name == "" || email == "") {

&#x20;   alert("Fill all fields");

&#x20;   return false;

&#x20; }

&#x20; return true;

}

</script>



</body>

</html>



###### **3. Navbar with Sections:**



<!DOCTYPE html>

<html>

<body>



<nav>

&#x20; <a href="#home">Home</a>

&#x20; <a href="#about">About</a>

</nav>



<section id="home"><h2>Home</h2></section>

<section id="about"><h2>About</h2></section>



</body>

</html>



###### **4. To-Do List (Add/Delete):**



<!DOCTYPE html>

<html>

<body>



<input id="task">

<button onclick="addTask()">Add</button>

<ul id="list"></ul>



<script>

function addTask() {

&#x20; let li = document.createElement("li");

&#x20; li.innerText = document.getElementById("task").value;



&#x20; li.onclick = function() { this.remove(); }



&#x20; document.getElementById("list").appendChild(li);

}

</script>



</body>

</html>



###### **5. Image Gallery with Hover:**



<!DOCTYPE html>

<html>

<style>

img { width:150px; transition:0.3s; }

img:hover { transform: scale(1.2); }

</style>

<body>



<img src="img1.jpg">

<img src="img2.jpg">



</body>

</html>



###### **6. Email \& Password Validation:**



<!DOCTYPE html>

<html>

<body>



<input id="email" placeholder="Email"><br>

<input id="pass" placeholder="Password"><br>

<button onclick="check()">Submit</button>



<script>

function check() {

&#x20; let email = document.getElementById("email").value;

&#x20; let pass = document.getElementById("pass").value;



&#x20; if (!email.includes("@"))

&#x20;   alert("Invalid Email");

&#x20; else if (pass.length < 6)

&#x20;   alert("Weak Password");

&#x20; else

&#x20;   alert("Valid");

}

</script>



</body>

</html>



###### **7. Simple Quiz:**





<!DOCTYPE html>

<html>

<body>



<p>2 + 2 = ?</p>

<button onclick="check(3)">3</button>

<button onclick="check(4)">4</button>



<script>

function check(ans) {

&#x20; if (ans == 4)

&#x20;   alert("Correct");

&#x20; else

&#x20;   alert("Wrong");

}

</script>



</body>

</html>



###### **8. Date \& Time Display:**



<!DOCTYPE html>

<html>

<body>



<p id="time"></p>



<script>

setInterval(function() {

&#x20; document.getElementById("time").innerText = new Date();

}, 1000);

</script>



</body>

</html>



###### **9. Flexbox Layout:**



<!DOCTYPE html>

<html>

<style>

.container { display: flex; }

.box { background: lightgreen; padding: 20px; margin: 5px; }

</style>

<body>



<div class="container">

&#x20; <div class="box">1</div>

&#x20; <div class="box">2</div>

&#x20; <div class="box">3</div>

</div>



</body>

</html>



###### **10. Mini Project (2 Pages):**



**Page 1: index.html**



<!DOCTYPE html>

<html>

<body>



<h2>My Portfolio</h2>

<a href="about.html">Go to About</a>



</body>

</html>



**Page 2: about.html**



<!DOCTYPE html>

<html>

<body>



<h2>About Me</h2>

<button onclick="show()">Click Me</button>



<script>

function show() {

&#x20; alert("Hello!");

}

</script>



</body>

</html>

