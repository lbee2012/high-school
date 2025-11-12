<template>
    <main class="container">
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Ten</label>
            <input type="text" class="form-control" v-model="phong.ten">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Tang</label>
            <input type="text" class="form-control" v-model="phong.tang">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Loai phong</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio1" :value=false v-model="phong.loai" checked>
                <label class="form-check-label" for="inlineRadio1">Phong thuong</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" :value=true v-model="phong.loai">
                <label class="form-check-label" for="inlineRadio2">Phong VIP</label>
            </div>
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Dien tich</label>
            <input type="text" class="form-control" v-model="phong.dienTich">
        </div>
        <!-- <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Min</label>
            <input type="text" class="form-control" v-model="search.min">
        </div>
        <div class="mb-3">
            <label for="exampleFormControlInput1" class="form-label">Max</label>
            <input type="text" class="form-control" v-model="search.max">
        </div> -->
    </main>
</template>

<script setup>
defineModel('phong', {
    default:() => ({
        ten: '',
        tang: 0,
        loai: false,
        dienTich: 0,
    })
})
defineModel('search', {
    default: () => ({
        min: 0,
        max: 0,
    })
})
</script>

<style scoped>

</style>