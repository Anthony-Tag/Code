console.log("this is not Hello World");
console.log("this is not Hello World");
console.log("i am here");
console.log("and i'm back")

//============== Variables ==============
console.log("===== Variable ======")

let s1 = "hello"
let s2 = "world"

console.log(`${s1} ${s2}`);//called template literals

//ANY - is the default type of a declare variable in TS if no type was implicity or explicitly given
let a1;
a1="String";
a1 = 6;
a1 = null;
a1 = true;

console.log(typeof a1)

//You can add multiple types to a variable using '|' inbetween the types
let b1: string | number;
b1 = "string";
b1 = 6;

//NULL and UNDEFINED
let nul1 =null;
let nul2:null;

console.log(typeof nul1)
console.log(typeof nul2)

//ARRAYS
let arr1:any[];
arr1 = ["string", 5, null, true];
console.log(arr1);
arr1.push("new value");
console.log(arr1);

let arr2: (string | number)[];
arr2 = ["s1", 5, 6, "s2"];
console.log(arr2)

//TUPLE - It is an array that can contain a fixed size of number elements (tink java arrbut you can have multipe types of variable)
let tul1: [string, boolean, number];
tul1 = ["string", true, 5];
console.log(tul1);

//EMUS - specified set of named constants. It is a lot easier to do it TS
enum Engine
{
    OFF = 0,
    ON = 1,
    Reverse = -1
}

let engineState = 0;
if(engineState == Engine.OFF)
{
    console.log("Engine is off");
}

//================ Functions =============
console.log("==== Function ====");

function sumNum(p1:number, p2:number): void{
    console.log(p1+p2);
}

sumNum(1,3);

function sumNum1(p1:number, p2:number): number{
    return (p1+p2);
}

console.log(sumNum(2,4));

//============= Classes and Objects =============
console.log("==== Classes and Objects ====");

class SuperVillian
{
    name:string;
    superpower:string;
    bounty:number;

    constructor(name:string, superpower:string, bounty:number)
    {
        this.name =name;
        this.superpower = superpower;
        this.bounty = bounty;
    }

    useAbility(): void
    {
        console.log(`${this.superpower} has been unleadshed`);
    }
}

let vil1:SuperVillian;
vil1 = new SuperVillian("Stephen", "Bad speeling", 1);
vil1.useAbility();

class Pet
{
    constructor(private name:string, public breed:string, protected age:number)
    {
        
    }

    public getname(): string
    {
        return this.name;
    }
    public get Name(): string
    {
        return this.name;
    }

    public set Name(name:string)
    {
        this.name = name;
    } 
}

let p1: Pet;
p1 = new Pet("Moxie", "Chinhuahua", 5);
console.log(p1.Name);
p1.Name = "Moxy";
console.log(p1.Name);

//Interfaces

interface Animal
{
    name?:string;
    isAlive:boolean;
    speed:number;

    speak(): string
    run?(speed?:number): string
}

class Dog implements Animal
{
    isAlive: boolean;
    speed: number

    constructor(isAlive: boolean, speed:number)
    {
        this.isAlive = isAlive;
        this.speed = speed;
    }

    speak(s1?:string):string
    {
        return "bark"
    }
}

//Arrow Notation (parameter) +> {implementation}
console.log("==== Arrow Notation ====");
let Func3 = (s1:string) => {console.log(s1);}
Func3("hello");
let Func4 = (s1:string, s2:string) => 
{
    console.log(s1);
    console.log(s2);
}
Func4("hello", "world");

//=========== Modules =============

/*
    -It is a way to organize your code into "packages" of like funcionality
    -Internal moduales wer used in early versions of TypeScript, it was used to group class
    -External modules exitst to specify and load dependecies betweeen multiple external JavaScript and Type Script files
    to declare a module in other files/location, we will use the 'export' 
*/
    