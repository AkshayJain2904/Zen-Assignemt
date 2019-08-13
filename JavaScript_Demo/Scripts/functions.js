/*var x=10
alert(x)
x='akshay'
alert(x)*/

//nmaed function
var x1=10;


function addNums(x,y)
{
    //console.log(x+y)
    return x+y;
}
console.log('Addition is '+ addNums(12,12))
console.log('Addition of string '+ addNums("Learning","JS"))
console.log('Addition is '+ addNums(12,"HI"))
console.log('Addition is '+ addNums(12))
console.log('Addition is '+ addNums("Hello"))
console.log("------------------------------------------------")

//anonymous function
 var res=function(){
     console.log("Anonymous function")
 }
 res();

//IIFE
(function(a,b){
     console.log(a-b)
 })(23,4)


//constructor function
var a1=[]   //empty array
var arr=[2,3,45,2,421,4];

for(var a in arr){
    console.log(arr[a]);
}

var a2=new Array()

console.log(a2)

function Employee(eid,fname,lname){
    this.eid=eid
    this.fname=fname
    this.lname=lname
}

//using function prototype

Employee.prototype.age

var e1=new Employee(101,"Akshay","Jain")
console.log(e1)
e1.age=23


















/*
function addNumbers(){
    var firstNumber=parseFloat(document.getElementById("fnum").value);
    if(isNaN(firstNumber))
        {
            alert("enter a valid number");
            return;
        }
    var secondNumber=parseFloat(document.getElementById("lnum").value);
     if(isNaN(secondNumber))
        {
            alert("enter a valid number");
            return;
        }
    document.getElementById("result").value=firstNumber+secondNumber;
}

function getEmailAndDomainParts(){
    var emailAddress=document.getElementById("eaddress").value;
    var emailpart=emailAddress.substring(0,emailAddress.indexOf("@"));
    var domainpart=emailAddress.substring(emailAddress.indexOf("@")+1);
    
    document.getElementById("epart").value=emailpart;
    document.getElementById("dpart").value=domainpart;
}
*/
