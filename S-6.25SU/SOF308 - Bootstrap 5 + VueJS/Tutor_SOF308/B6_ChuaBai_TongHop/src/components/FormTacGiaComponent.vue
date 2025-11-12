<template>
    <section>
        <form>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Ten</label>
                <input type="email" class="form-control" v-model="tacGia.ten">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Tuoi</label>
                <input type="email" class="form-control" v-model="tacGia.tuoi">
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" :value="true" v-model="tacGia.gioiTinh">
                <label class="form-check-label" for="inlineRadio1">Nam</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" :value="false" v-model="tacGia.gioiTinh">
                <label class="form-check-label" for="inlineRadio2">Nu</label>
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Dia chi</label>
                <input type="email" class="form-control" v-model="tacGia.diaChi">
            </div>
        </form>
    </section>
</template>

<script setup>
defineModel('tacGia', {default: {
    ten: '',
    tuoi: 0,
    gioiTinh: true,
    diaChi: '',
}})
</script>

<style scoped>

</style>