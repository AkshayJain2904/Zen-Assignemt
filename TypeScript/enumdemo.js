var color;
(function (color) {
    color[color["red"] = 0] = "red";
    color[color["blue"] = 1] = "blue";
    color[color["green"] = 2] = "green";
    color[color["yellow"] = 3] = "yellow";
})(color || (color = {}));
var c = color.green;
console.log(c);
var colorname = color[2];
console.log(colorname);
var months;
(function (months) {
    months[months["jan"] = 0] = "jan";
    months[months["feb"] = 1] = "feb";
    months[months["mar"] = 2] = "mar";
    months[months["apr"] = 3] = "apr";
    months[months["may"] = 4] = "may";
    months[months["june"] = 5] = "june";
    months[months["july"] = 6] = "july";
    months[months["aug"] = 7] = "aug";
    months[months["sep"] = 8] = "sep";
    months[months["oct"] = 9] = "oct";
    months[months["nov"] = 10] = "nov";
    months[months["dec"] = 11] = "dec";
})(months || (months = {}));
for (var i in months) {
    console.log(i);
}
