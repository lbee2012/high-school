<template>
    <section>
        <form>
            <h1>Quan ly Sach</h1>
            <div class="mb-3">
                <label for="ten" class="form-label">Ten</label>
                <input type="text" class="form-control" id="ten" v-model="b.ten">
            </div>
            <div class="mb-3">
                <label for="loai" class="form-label">Loai</label>
                <select class="form-select" id="loai" v-model="b.loai">
                    <option value="loai 1">Loai 1</option>
                    <option value="loai 2">Loai 2</option>
                    <option value="loai 3">Loai 3</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="tac_gia" class="form-label">Tac Gia</label>
                <input type="text" class="form-control" id="tac_gia" v-model="b.tac_gia">
            </div>
            <div class="mb-3">
                <label for="gia" class="form-label">Gia</label>
                <input type="number" class="form-control" id="gia" v-model="b.gia">
            </div>
        </form>
    </section>
</template>

<script setup>
defineModel('b', {
    default: () => ({ ten: '', loai: '', tac_gia: '', gia: 0 }),
});
</script>

<style scoped>
h1 {
    text-align: center;
}
button {
    margin: 25px;
}
</style>