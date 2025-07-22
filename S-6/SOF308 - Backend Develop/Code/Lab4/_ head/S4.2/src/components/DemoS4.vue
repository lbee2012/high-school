<script setup>
const ten = 'Long'
console.log(ten)

let tuoi = 17
tuoi = tuoi + 1
console.log(tuoi)

const pi = 3.14
let range = 5
let p = 2*pi*range
console.log(p)

//Khai bao Phuong thuc
//C1: Kieu truyen thong
let a = 0
function increment() {
  a++
  console.log(a)
}
increment()

//C2: Kieu function
const reset = function() {
  a = 0
  console.log(a)
}

//Phep noi suy {{ xxx }}
const statement = 'hello'

const tenSP = 'ProtoArc EM01'
const giaSP = 1000000
const giamGia = 0.1

//Raw HTML
//syntax: <tag v-html="xxx"></tag>
//xxx la ten bien chua chuoi
let rawHTML = 'Toi la HTML'

// v-bind
let url = 'https://classroom.google.com/c/Nzg4Mzk2Njc3ODk3'

import { ref } from 'vue'
const urlRef = ref('https://classroom.google.com/c/Nzg4Mzk2Njc3ODk3')
const changeLink = () => {
    urlRef.value = 'https://www.youtube.com/@reysu'
}

//showMessage
const message = ref('Hello Vue 3!')
const changeMessage = () => {
  message.value = 'Hello from Reysu!'
}
</script>

<template>
    <h1>nothign here</h1>
    <div> <!-- functions -->
        <button v-on:click="increment()">increase</button>
        <button v-on:click="reset()">reset</button>
    </div>
    <h1>statement: {{ statement }}</h1>
    <p>San pham: {{ tenSP }}</p>
    <p>Gia san pham: {{ giaSP }} VND</p> 
    <p>Gia san pham sau khi giam: {{ giaSP - (giaSP * giamGia) }} VND</p>
    <br>
    <span v-html="rawHTML"></span>

    <div>
        <!-- non-v-bind -->
        <a href="https://classroom.google.com/c/Nzg4Mzk2Njc3ODk3">href</a>

        <br>

        <!-- v-bind href -->
        <a v-bind:href="url">v-bind</a>
        
        <br>

        <!-- v-bind change link -->
        <a v-bind:href="urlRef">Link ne</a>
        <button @click="changeLink">Change Link</button>
    </div>

    <div>
        <h1>message: {{ message }}</h1>
        <button @click="changeMessage">Change Message</button>
    </div>
</template>