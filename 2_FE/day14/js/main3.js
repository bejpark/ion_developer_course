function scope() {
    if (true) {
        const a = 123
        console.log(a)
            // let b = 234
        var c = 444
    }
    // console.log(b)
    console.log(c)
    console.log(d + '외부 d')
        //var은 내부선언된 것도 접근가능
}

var d = 90
scope();

function hap(x, y) {
    console.log(x + y);
    //console.log(d);
    return x + y;
}

hap('a', 'b');
hap(1, 3);

const b = hap(10, 10)
console.log(b)

const sum = function(x, y) {
    return x + y;
}
console.log(sum)
console.log(sum(1, 2))

function sum2() {
    console.log(arguments)
    return arguments[0]
}
console.log(sum2(7, 3, 8, 6))

//array function
//()=>{} vs function() {}

const doubleFn = function(x, y) {
    return x * 2;
}
console.log('doubleFn : ', doubleFn(7));

console.log('doubleFn  ', doubleFn(3, 5, 8));

// const doubleArrow = x=>{
//     return x*2
// }
// const doubleArrow = x => x * 2
const doubleArrow = x => ({ name: 'Yuna', x });

console.log('doubleArrow : ', doubleArrow(3));
// const f = 3;
(function() {
    console.log(d * 2);
})();
//(x)()
//(x())