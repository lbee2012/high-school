<template>
    <main class="container">
        <h1>Quan ly Tac gia</h1>
        <TacGiaComponent v-model:tg="tg"/>
        <button type="button" class="btn btn-primary" @click="addTG()">Add</button>
        <table class="table container">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">Ten</th>
                    <th scope="col">Gioi tinh</th>
                    <th scope="col">Dia chi</th>
                    <th scope="col">Tuoi</th>
                    <th scope="col">Hanh dong</th>
                </tr>
            </thead>
            <tbody>
                <template v-for="(item, index) in listTG" :key="item.id">
                    <tr>
                        <td>{{ index + 1 }}</td>
                        <td>{{ item.ten }}</td>
                        <td>{{ item.gioiTinh == true ? "Nam" : "Nu" }}</td>
                        <td>{{ item.diaChi }}</td>
                        <td>{{ item.tuoi }}</td>
                        <td>
                            <button type="button" class="btn btn-danger" @click="deleteTG(index)">Delete</button>
                        </td>
                    </tr>
                </template>
            </tbody>
        </table>
    </main>
</template>

<script setup>
import TacGiaComponent from '@/components/TacGiaComponent.vue';
import { ref } from 'vue';

const listTG = ref([
    { ten: 'tg1', gioiTinh: true, diaChi: 'dc1', tuoi: 1, id: 1 },
    { ten: 'tg2', gioiTinh: false, diaChi: 'dc2', tuoi: 2, id: 2 },
    { ten: 'tg3', gioiTinh: true, diaChi: 'dc3', tuoi: 3, id: 3 },
    { ten: 'tg4', gioiTinh: false, diaChi: 'dc4', tuoi: 4, id: 4 },
    { ten: 'tg5', gioiTinh: true, diaChi: 'dc5', tuoi: 5, id: 5 },
]);

const idUpdate = ref(-1);
const tg = ref({
    ten: '',
    gioiTinh: true,
    diaChi: '',
    tuoi: 0,
});

function deleteTG(index) {
    listTG.value.splice(index, 1);
};

function resetTG() {
    tg.value = {
        ten: '',
        gioiTinh: true,
        diaChi: '',
        tuoi: 0,
    };
};

function addTG() {
    listTG.value.push({
        id: listTG.value.length + 1,
        ...tg.value,
    });
    resetTG();
};
</script>

<style scoped>
h1 {
    text-align: center;
}
</style>