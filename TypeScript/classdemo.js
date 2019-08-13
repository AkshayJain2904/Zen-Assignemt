var student = /** @class */ (function () {
    function student(no, name) {
        this.no = no;
        this.name = name;
    }
    student.prototype.display = function () {
        console.log(this.no + " " + this.name);
    };
    return student;
}());
;
var ob1 = new student(12, "Ram");
ob1.display();
