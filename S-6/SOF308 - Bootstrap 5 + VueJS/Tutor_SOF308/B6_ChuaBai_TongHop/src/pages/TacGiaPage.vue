<template>
    <main class="container">
        <h1>Quan ly Tac gia</h1>
        <FormTacGiaComponent v-model:tacGia="newTacGia"/>
        <button type="button" class="btn btn-primary" v-if="isUpdate == -1">Add</button>
        <button type="button" class="btn btn-success" v-if="isUpdate != -1">Update</button>
        <section>
        <table class="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Ten</th>
                <th scope="col">Tuoi</th>
                <th scope="col">Gioi tinh</th>
                <th scope="col">Dia chi</th>
                <th scope="col">Hanh dong</th>
                </tr>
            </thead>
            <tbody>
                <template v-for="(tacGia, index) in listTacGia" :key="tacGia.id">
                    <tr>
                        <td>{{ index++ }}</td>
                        <td>{{ tacGia.ten }}</td>
                        <td>{{ tacGia.tuoi }}</td>
                        <td>{{ tacGia.gioiTinh == true ? "Nam" : "Nu"}}</td>
                        <td>{{ tacGia.diaChi }}</td>
                        <td>
                            <button type="button" class="btn btn-danger" @click="deleteTG(index)">Delete</button>
                            <button type="button" class="btn btn-warning" @click="detailTG(tacGia)">Detail</button>
                        </td>
                    </tr>
                </template>
            </tbody>
        </table>
        </section>
    </main>
</template>

<script setup>
import FormTacGiaComponent from '@/components/FormTacGiaComponent.vue';
import { ref } from 'vue';

const listTacGia = ref([
    { id: '01', ten: 'tacGia1', tuoi: 20, gioiTinh: true, diaChi: 'diaChi1'},
    { id: '02', ten: 'tacGia2', tuoi: 10, gioiTinh: true, diaChi: 'diaChi2'},
    { id: '03', ten: 'tacGia3', tuoi: 22, gioiTinh: false, diaChi: 'diaChi3'},
    { id: '04', ten: 'tacGia4', tuoi: 23, gioiTinh: true, diaChi: 'diaChi4'},
    { id: '05', ten: 'tacGia5', tuoi: 24, gioiTinh: true, diaChi: 'diaChi5'},
]);

const newTacGia = ref({
    ten: '',
    tuoi: 0,
    gioiTinh: true,
    diaChi: '',
});

function deleteTG(index) {
    listTacGia.value.splice(index, 1);
};
function detailTG(tacGia) {
    newTacGia.value = { ...tacGia };
    idUpdate.value = listTacGia.value.findIndex(d => d.id === tacGia.id);
};

const isUpdate = ref(-1);

function addTacGia() {
    listTacGia.value.push({
        id: listTacGia.value.length + 1,
        ... newTacGia.value,
    });
    resetTacGia();
};
function updateTacGia() {
    listTacGia.value[idUpdate.value] = { ...newTacGia.value };
    resetTacGia();
    isUpdate.value = -1;
};
function resetTacGia() {
    newTacGia.value = {
        ten: '',
        tuoi: 0,
        gioiTinh: true,
        diaChi: '',
    };
};
</script>

<style scoped>
h1 {
    text-align: center;
}
</style>