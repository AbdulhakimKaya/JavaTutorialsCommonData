// alert("Deneme")
// window.alert("Deneme")
// window.document.write("Bizim Ekran")
// document.write(" Bizim Ekran 2")
// console.log("bizim console")
// console.warn("bizim warning")
// console.error("bizim error")
// console.info("bizim info")


/*
   var -> global'dir ve değiştirilebilir
   let -> local'dir, o scope içinde geçerlidir
   const -> local'dir, o scope içinde geçerlidir, değiştirilemez, sabit değişkenlerde kullanılır
*/

// var deneme = 24
// var deneme = 21
//
// console.log(deneme)


// let result = prompt("İsminizi giriniz: ")
// alert("Hoşgeldiniz " + result)


// let $_valueName21 = true
// console.log($_valueName21)
// console.log(typeof $_valueName21)


// whoisting yapısı -> var ile kullanılır
// deneme = 21+34
// var deneme;
// console.log(deneme)


// cast

// let data = Number(prompt("Sayı giriniz"))
// console.log(typeof data)  // sayı girmesem de tipi number olarak döner
// console.log(data)         // ancak veri NaN olarak döner -> Not a Number
//
// let data2 = Number("10")  // string olarak verilen sayının tipini number yapar
// console.log(data2)
// console.log(typeof data2)
//
// let data3 = String(10)  // number olarak verilen sayının tipini string yapar
// console.log(data3)
// console.log(typeof data3)


// NaN undefined infinity

// let data4 = 3/0
// console.log(data4)  // cevap sonsuz olduğu için infinity olarak döner
// console.log(typeof data4)  // tipi number döner
//
// let data5 = 3/"asd"
// console.log(data5)  // sayı olmadığı için NaN döner
// console.log(typeof data5)  // tipi number döner
//
// let data6;
// console.log(data6)  // tanımlı bi değer olmadığı için undefined döner
// console.log(typeof data6)  // tanımlı bi değer olmadığı için undefined döner


// escaper character
//  \'  \"


// String

// let vocabulary = "I'am learning JavaScript JavaScript   "
// console.log(vocabulary)
// console.log(vocabulary.toLowerCase())
// console.log(vocabulary.toUpperCase())
// console.log(vocabulary.length)
// console.log(vocabulary.trim().length)
// console.log(vocabulary.charAt(0))
// console.log(vocabulary.indexOf("JavaScript"))
// console.log(vocabulary.lastIndexOf("JavaScript"))
// console.log(vocabulary.startsWith("I'am"))
// console.log(vocabulary.endsWith("JavaScript"))
// console.log(vocabulary.substring(1))
// console.log(vocabulary.substring(1,4))


// Math

// console.log(Math.min(2,5,1,9))
// console.log(Math.max(2,5,1,9))
// console.log(Math.sqrt(100))
// console.log(Math.abs(-100))
// console.log(Math.pow(2,3))
// console.log(Math.sin(90))
// console.log(Math.cos(90))
// console.log(Math.floor(5.7))
// console.log(Math.ceil(5.7))
// console.log(Math.round(5.4))
// console.log(Math.round(5.5))


// function

// function returnsuzParametresiz() {
//     console.log("Returnsuz Parametresiz")
// }
//
// returnsuzParametresiz()
//
// function returnsuzParametreli(data) {
//     console.log("Returnsuz Parametreli " + data)
// }
//
// returnsuzParametreli("function")
//
// function returnluParametresiz() {
//     return "Returnlu Parametresiz"
// }
//
// let data = returnluParametresiz()
// console.log(data)
//
// function returnluParametreli(data) {
//     return "Returnlu Parametreli " + data
// }
//
// let data2 = returnluParametreli("function")
// console.log(data2)

// normal function

// function normal(){
//     console.log("normal function")
// }
// normal()

// anonymous function

// let anonymous = function () {
//     console.log("anonymous function")
// }
// anonymous()

// arrow function

// let arrow = () => {
//     console.log("arrow function")
// }
// arrow()


// conditional

// let conditional = () => {
//     let result = -5
//     // if (result > 0) {
//     //     console.log("pozitif sayı")
//     // }
//     // else {
//     //     console.log("negatif sayı")
//     // }
//
//     let condition = result > 0 ? "pozitif sayı" : "negatif sayı"
//     console.log(condition)
// }
// conditional()


// loop

// let loop = () => {
//     for (let i = 0; i < 10; i++) {
//         document.write(i + " ")
//     }
// }
// loop()
//
// document.writeln("<br/>")
//
// let loop2 = () => {
//     let i = 0;
//     while (i < 10) {
//         document.write(i + " ")
//         i++;
//     }
// }
// loop2()
//
// document.writeln("<br/>")
//
// let loop3 = () => {
//     let i = 0;
//     do {
//         document.write(i + " ")
//         i++;
//     }
//     while  (i < 10);
// }
// loop3()


// Exception handling

// let value = () => {
//     try {
//         document.write("ilk alan <br/>")
//         alerta("data")  // hatalı isim ile fonksiyon kullanmak
//     }
//     catch (error) {
//         document.write("Errors: " + error)
//     }
//     finally {
//         document.write("<br/> son alan")
//     }
// }
// value()


// Array

// let arr = [44, "str", true, [1,2,3]];
// console.log(typeof arr)  // object
// console.log(arr)
//
// let dizi = () => {
//     let temp;
//     let sum =0;
//     let dizi = []
//     for (let index = 0; index < 5; index++) {
//         temp = Math.round(Math.random()*9+1)
//         dizi[index] = temp
//         sum += dizi[index]
//     }
//     console.log(dizi)
//     console.log(sum)
//
//     dizi.forEach((value) => {
//         document.write(value + " ")
//     })
// }
// dizi()

// filter

// let diziFilter = () => {
//     let dizi = [1,2,3,4,5,6,7,8];
//     let result = dizi.filter((temp) => {
//         return temp % 2 === 0;
//     })
//     result.forEach((temp) => {
//         document.write("<br/>" + temp);
//     });
// }
// diziFilter()

// object

// let object = () => {
//     let obj = {
//         "firstName": "Abdulhakim",
//         "lastName": "KAYA",
//         "age": 20,
//         "isActive": true,
//         "languages": ["Java", "C#", "Python"],
//         "university": {
//             "name": "MTU",
//             "department": "Software Engineering",
//             "year": 3,
//             "graduate": false,
//         }
//     }
//     console.log(obj)
//     console.log(obj.firstName + " " + obj.lastName)
//     console.log(obj.languages)
//     console.log(obj.languages[0])
//     console.log(obj.university.department)
// }
// object()

// date

// let date = () => {
//     let value = new Date()
//     console.log(value)
//     console.log(value.getFullYear())
//     console.log(value.getDay())  // o günün index numarasını döner
//     console.log(value.getHours())
// }
// date()