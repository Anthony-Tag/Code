console.log("this is not Hello World");
console.log("this is not Hello World");
console.log("i am here");
console.log("and i'm back");
//============== Variables ==============
console.log("===== Variable ======");
let s1 = "hello";
let s2 = "world";
console.log(`${s1} ${s2}`); //called template literals
//ANY - is the default type of a declare variable in TS if no type was implicity or explicitly given
let a1;
a1 = "String";
a1 = 6;
a1 = null;
a1 = true;
console.log(typeof a1);
//You can add multiple types to a variable using '|' inbetween the types
let b1;
b1 = "string";
b1 = 6;
//NULL and UNDEFINED
let nul1 = null;
let nul2;
console.log(typeof nul1);
console.log(typeof nul2);
//ARRAYS
let arr1;
arr1 = ["string", 5, null, true];
console.log(arr1);
arr1.push("new value");
console.log(arr1);
let arr2;
arr2 = ["s1", 5, 6, "s2"];
console.log(arr2);
//TUPLE - It is an array that can contain a fixed size of number elements (tink java arrbut you can have multipe types of variable)
let tul1;
tul1 = ["string", true, 5];
console.log(tul1);
//EMUS - specified set of named constants. It is a lot easier to do it TS
var Engine;
(function (Engine) {
    Engine[Engine["OFF"] = 0] = "OFF";
    Engine[Engine["ON"] = 1] = "ON";
    Engine[Engine["Reverse"] = -1] = "Reverse";
})(Engine || (Engine = {}));
let engineState = 0;
if (engineState == Engine.OFF) {
    console.log("Engine is off");
}
//================ Functions =============
console.log("==== Function ====");
function sumNum(p1, p2) {
    console.log(p1 + p2);
}
sumNum(1, 3);
function sumNum1(p1, p2) {
    return (p1 + p2);
}
console.log(sumNum(2, 4));
//============= Classes and Objects =============
console.log("==== Classes and Objects ====");
class SuperVillian {
    constructor(name, superpower, bounty) {
        this.name = name;
        this.superpower = superpower;
        this.bounty = bounty;
    }
    useAbility() {
        console.log(`${this.superpower} has been unleadshed`);
    }
}
let vil1;
vil1 = new SuperVillian("Stephen", "Bad speeling", 1);
vil1.useAbility();
class Pet {
    constructor(name, breed, age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    getname() {
        return this.name;
    }
    get Name() {
        return this.name;
    }
    set Name(name) {
        this.name = name;
    }
}
let p1;
p1 = new Pet("Moxie", "Chinhuahua", 5);
console.log(p1.Name);
p1.Name = "Moxy";
console.log(p1.Name);
class Dog {
    constructor(isAlive, speed) {
        this.isAlive = isAlive;
        this.speed = speed;
    }
    speak(s1) {
        return "bark";
    }
}
//Arrow Notation (parameter) +> {implementation}
console.log("==== Arrow Notation ====");
let Func3 = (s1) => { console.log(s1); };
Func3("hello");
let Func4 = (s1, s2) => {
    console.log(s1);
    console.log(s2);
};
Func4("hello", "world");
