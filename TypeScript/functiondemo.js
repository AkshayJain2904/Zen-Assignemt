function add(x, y) {
    return x + y;
}
var c = add(10, 20);
console.log("Result is " + c);
function multiply(x, y) {
    return x * y;
}
var b = multiply(2, 4);
console.log(b);
//annonymous function
var anoAdd = function (a, b) {
    return a + b;
};
console.log(anoAdd(20, 40));
function f(shouludinitialize) {
    if (shouludinitialize) {
        var p = 10;
    }
    return p;
}
console.log(f(true));
console.log(f(false));
//declaring a constant
var PI = 3.14;
console.log(PI);
//object data type
var student = {
    no: 10,
    name: "Akshay",
    percent: 23.43
};
console.log(student.name);
console.log("------------------------------------------");
var add1 = function (a, b) { return a + b; };
console.log("adition is " + add1(10, 20));
var message = function () {
    console.log("hello world");
    console.log("lamda");
};
message();
var raisevalue = function (x) { return x + 1; };
console.log(raisevalue(10));
