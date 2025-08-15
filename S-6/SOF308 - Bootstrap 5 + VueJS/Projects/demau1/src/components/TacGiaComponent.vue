<template>
    <main class="container">
        <div class="mb-3">
            <label class="form-label">Ten</label>
            <input class="form-control" v-model="tg.ten">
        </div>
        <div class="mb-3">
            <label class="form-label">Gioi tinh</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" :value="true" v-model="tg.gioiTinh" checked>
                <label class="form-check-label" for="inlineRadio1">Nam</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" :value="false" v-model="tg.gioiTinh">
                <label class="form-check-label" for="inlineRadio2">Nu</label>
            </div>
        </div>
        <div class="mb-3">
            <label class="form-label">Dia chi</label>
            <input class="form-control" v-model="tg.diaChi">
        </div>
        <div class="mb-3">
            <label class="form-label">Tuoi</label>
            <input class="form-control" v-model="tg.tuoi">
        </div>
    </main>
</template>

<script setup>
defineModel('tg', {
    default: () => ({
        ten: '',
        gioiTinh: true,
        diaChi: '',
        tuoi: 0,
    })
})
</script>

<style scoped>

</style>