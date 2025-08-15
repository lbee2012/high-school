<template>
    <section class="container">
        <form>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Ten</label>
                <input type="email" class="form-control" v-model="ma.ten">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Loai</label>
                <br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" :value="true" v-model="ma.loai">
                    <label class="form-check-label" for="inlineRadio1">Chinh</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" :value="false" v-model="ma.loai">
                    <label class="form-check-label" for="inlineRadio2">Phu</label>
                </div>
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Gia</label>
                <input type="email" class="form-control" v-model="ma.gia">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Mo ta</label>
                <input type="email" class="form-control" v-model="ma.moTa">
            </div>
        </form>
    </section>
</template>

<script setup>
defineModel('ma', {
    default: () => ({
        ten: '',
        loai: '',
        gia: 0,
        moTa: '',
    }),
});
</script>

<style scoped>

</style>