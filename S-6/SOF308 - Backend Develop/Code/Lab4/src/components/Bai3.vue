<template>
    <h1>{{ greeting }}</h1>

    <button v-bind:title="buttonTitle" @click="changeGreeting">Click để thay đổi lời chào</button>
</template>

<script setup>
    import { ref } from 'vue';

    const buttonTitle = ref('Xin chao')
    const greeting = ref('Loi chao ban dau')

    const changeGreeting = () => {
        buttonTitle.value = 'Hi'
        greeting.value = 'Loi chao da duoc thay doi'
    }
</script>