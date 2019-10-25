# TryDagger2 
ทดลองการใช้งาน Dagger 2 เพื่อใช้ในการทำโปรเจกต์ E-health For Personal Sensor Application โดยอ้างอิงตาม 
Tutorial ATM ใน [Dagger.dev](https://dagger.dev) โดยทดลองด้วยภาษา Java บน IntelliJ IDEA อ้าง Build Tools
เป็น Gradle ก่อนที่จะทำจะต้องตั้งค่า Dependency ใน Build.gradle ก่อน ข้อมูลจากการโน้ตระหว่างการทดลองทำ อาจผิดพลาดบ้าง

## คำศัพท์และคำสั่งต่างๆ
- `@Component` เป็นการบอก Dagger เพื่อให้มันจัดการกับ Interface หรือ abstract class ซึ่งสร้างและ Return Object ออกมา 
   ปกติ Abstract Class หรือ Interface สร้าง Object ไม่ได้ โดย Dagger จะสร้าง Class ที่ถูก implement แล้ว โดยใช้ชื่อว่า Dagger
   ตามด้วยชื่อ abstract class หรือ interface นั้นๆ หรือ Dagger......_NestedType ถ้ามันเป็น Nestedtype
-   `@Inject` เป็น Constructor ที่จะบอก Dagger ว่าให้มันสร้าง Instance / สร้าง Object ยังไงจาก class นี้
