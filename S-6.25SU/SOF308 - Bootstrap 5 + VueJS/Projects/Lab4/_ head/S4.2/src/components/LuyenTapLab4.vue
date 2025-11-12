<script setup>
//bai1
const title = 'Chao mung ban den voi Vue!'

//bai2
let name = 'Long'
let school = 'FPT Polytechnic'

//bai3
const welcome = '<b>Chao ban!</b>'

//bai4
const link = 'https://vuejs.org'

//bai5
let year = 2025

//bai6
let a = 5
let b = 3

</script>

<template>
    <h1>{{ title }}</h1>
    <br>
    <p>Ten toi la {{ name }}. Toi hoc tai {{ school }}</p>
    <br>
    <p v-html="welcome"></p>
    <br>
    <a :href="link">VueJS</a>
    <br>
    <br>
    <p>Nam nay la nam {{ year }}</p>
    <br>
    <p>Ket qua cua {{ a }} + {{ b }} = {{ a + b }}</p>
</template>