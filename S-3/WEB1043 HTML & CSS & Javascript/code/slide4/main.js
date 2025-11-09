// let dog = {
//     ten: "ali",
//     tuoi: 16,
//     maulong: "den",
//     sua: function() {
//         return "gau gau"
//     }
// }

// console.log(dog.ten)
// dog.ten = alo
// console.log(dog.ten)
// console.log(dog.sua)



// function cat(ten, tuoi, mau) {
//     this.ten = ten
//     this.tuoi = tuoi
//     this.mau = mau
//     this.keu = function() {
//         return "meo meo"
//     }
// }

// cat[0] = new cat()
// cat[1] = new cat("tintin", 1, "white")
// cat[2] = new cat("bebe", 1, "black")

// console.log(cat[0].mau)
// console.log(cat[1].mau)
// console.log(cat[2].mau)

// let cat1 = new cat();
// console.log(cat1.ten)
// console.log(cat1.keu())
// let cat2 = new cat();

// //duyet phan tu cua mang su dung for in
// for (var x in cat) {
//     cns.log(cat[x].ten)
// }



let inventory = []

let item1 = {
    name: "shit",
    model: "2024",
    cost: 100,
    quantity: 100
}
let item2 = {
    name: "poop",
    model: "2024",
    cost: 200,
    quantity: 200
}
let item3 = {
    name: "pee",
    model: "2024",
    cost: 300,
    quantity: 300
}

inventory.push(item1)
inventory.push(item2)
inventory.push(item3)

for (var i in inventory) {
    console.log(inventory[i])
}