<script setup>
import { ref } from 'vue';
var user = ref({
    name: "Hoang Quy Long",
    age: 18,
    email: "hoangflong2012@gmail.com"
});
</script>

<style scoped>
button {
    background-color: cadetblue;
    color: white;
    border-radius: 10px;
    padding: 5px 10px;
    text-align: center;
    border: none;
}
</style>

<template>
    <div>
        <h3>{{ user.name }}</h3>
        <h3>{{ user.age }}</h3>
        <h3>{{ user.email }}</h3>
        <br>
        <button @click="user.name='Quy Long Hoang'">Change new name</button>
        <button @click="user.name='Hoang Quy Long'">Change back name</button>
        <br>
        <button @click="user.age=20">Change new age</button>
        <button @click="user.age=18">Change back age</button>
        <br>
        <button @click="user.email='longgggg201205@gmail.com'">Change new email</button>
        <button @click="user.email='hoangflong2012@gmail.com'">Change back email</button>
    </div>
</template>
