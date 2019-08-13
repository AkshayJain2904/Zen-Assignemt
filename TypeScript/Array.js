var numArr = [10, 20, 30, 40, 50];
console.log(numArr);
var city = ["Indore", "Mumbai", "Pune",];
console.log(city);
console.log("using for each");
numArr.forEach(function (ele) {
    console.log(ele);
});
//Initializing array at the time of declaration
var arr1 = [100, 500, 200, 700];
console.log("Size of array1 is: " + arr1.length);
//using for in loop
for (var i in arr1) {
    console.log(arr1[i]);
}
//using for of loop
for (var _i = 0, arr1_1 = arr1; _i < arr1_1.length; _i++) {
    var e = arr1_1[_i];
    console.log(e);
}
