<script setup>
import { reactive } from 'vue'

var styleObject = reactive({
  backgroundColor: 'lightgray',
  fontSize: '18px',
  color: 'black',
})
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
  <div :style="styleObject">
    <p>Styled text</p>
    <button class="btn btn-primary" @click="styleObject.backgroundColor = styleObject.backgroundColor === 'lightgray' ? 'lightblue' : 'lightgray'">Doi mau nen</button>
  </div>    
</template>