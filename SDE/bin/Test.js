<!DOCTYPE html>
<html>
<title>Web Page Design</title>
<head>
<script>
// function sayHello() {
//   document.write("Hello, Coding Ground!");
// }
// sayHello();

//Date and time
// var now = new Date();
// document.write(now);

// var datestring = now.toString()
// document.write("<br>"+datestring);

// var day  = now.getDay();
// document.write("Day  : "+day);    //prints 3 number of day not Day name

//getDay()   - day of week,   0-6 , 0 is Sunday
//getMonth() - month,         0-11, 0 is January
//getDate()  - day of month,  1-31, 
//getFullYear() - year            ,   2015
//getHours() - hour,          0-23,  0 -midnight, 12 is noon,23 - 11pm
//getMinutes() - minute,      0-59,
//getSeconds() - seconds,     0-59
//getMilliseconds() - ms,     0-999
//getTime()   - Milliseconds since midnight January 1,1970
// document.write("<br>Month   : "+now.getMonth());
// document.write("<br>Date    : "+now.getDate());
// document.write("<br>FullYear: "+now.getFullYear());
// document.write("<br>Hour    : "+now.getHours());
// document.write("<br>Minutes : "+now.getMinutes());
// document.write("<br>Seconds : "+now.getSeconds());
// document.write("<br>ms:"+now.getMilliseconds());
// document.write("<br>Time1970: "+now.getTime());

// var future = new Date("May 15, 2022");
// var today  = new Date();

// var diff = future - today;
// document.write(diff);   //diff is in milliseconds

// var fut = future.getTime();
// var tod = today.getTime();

// document.write("<br>"+(fut-tod))

// var newday = new Date("May 10, 2022 13:00:25");
// document.write("<br>"+newday);

//--Changing elements of date and time
//setFullYear() - d.setFullYear(2006)
//setMonth()    - d.setMonth(6) - july
//setDate()     - d.setDate(6) - 6 of month
//setHours()  - d.setHours(6)   //6 am 
//setMinutes()  - d.setMinutes(6) //
//setSeconds()  - d.setSeconds(7)
//setMilliseconds() - d.setMilliseconds(7)


/////Functions

// 	function tellTime(){
// 	var now = new Date();
// 	var theHr = now.getHours();
// 	var theMin = now.getMinutes();
	
// 	document.write("Current time:"+ theHr+":"+theMin);
// 	}	

// 	tellTime();


// function addNumber(){
//     var a = 6;
//     var b = 10;
//     var sum = a+b;
//     document.write("Sum of "+a+" and "+b+" is "+sum);
    
// }

// addNumber()


////Passing data to function
// 		var greetings = "Hi Guys!"
		
// 		function greet(greetings){
// 			document.write(greetings+"<br>");
// 		}
//         greet()
// 		greet(greetings);
// 		greet("Hi");

////Passing data back from Function or return
// function addNumber(a,b){
//     sum = a+b;
//     return sum;
// }

// var sum1 = addNumber(6,7);
// document.write(sum1); //writes 13
// document.write("<br>")
// var sum2 = addNumber(addNumber(6,7),9);
// document.write(sum2);


////Global and local variables
//Global - declared in main code, knowneverywhere, usableeverywhere
//local  - declared in a function, known only to function
//     var a = 10; //global variable
//     function addNumber(a,b){
//         sum = a+b;
//         var c = 8;      //local variable
//         sum = sum+c;
//         return sum;
//     }
// var sum1 = addNumber(a,7);
// document.write(sum1); //writes 13


////Switch Statements
var dayOfWeek = new Date();
dayOfWeek = dayOfWeek.getDay();
document.write(dayOfWeek);
switch(dayOfWeek){
    case 0:
        document.write("Sunday");
    case 1:
        document.write("Monday");
    case 2:
        document.write("Tuesday");
    case 3:
        document.write("Wednesday");
    case 4:
        document.write("Thursday");
    case 5:
        document.write("Friday");
    case 6:
        document.write("Saturday");
    
}

</script>
</head>
<body>
</body>
</html>