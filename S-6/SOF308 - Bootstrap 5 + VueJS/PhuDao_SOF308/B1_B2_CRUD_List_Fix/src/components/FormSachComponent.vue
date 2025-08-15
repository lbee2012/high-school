<template>
    <main class="container">
        <form>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Ten</label>
                <input type="email" class="form-control" v-model="sach.ten">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Loai</label>
                <select class="form-select" aria-label="Default select example" v-model="sach.loai">
                    <option selected>Chon loai sach</option>
                    <option value="l1">l1</option>
                    <option value="l2">l2</option>
                    <option value="l3">l3</option>
                    <option value="l4">l4</option>
                    <option value="l5">l5</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Tac gia</label>
                <input type="email" class="form-control" v-model="sach.tacGia">
            </div>
            <div class="mb-3">
                <label for="exampleFormControlInput1" class="form-label">Gia</label>
                <input type="email" class="form-control" v-model="sach.gia">
            </div>
        </form>
    </main>
</template>

<script setup>
defineModel('sach', {
    default: () => ({
        ten: '',
        loai: '',
        tacGia: '',
        gia: 0,
    })
});

</script>

<style scoped>

</style>