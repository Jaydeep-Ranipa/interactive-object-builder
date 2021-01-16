# interactive-object-builder

A Java utility to build an object of a POJO class from Standard Input.

Refer the following steps to get started.

 Create a `FieldValueScanner`. 

    FieldValueScanner fvs = new FieldValueScanner(System.in);

 Create an `ObjectBuilder` of type `StdinObjectBuilder`.

    ObjectBuilder objectBuilder = new StdinObjectBuilder(fvs);

 This `objectBuilder` can be now used to build an object of any POJO class.

    MyPojoClass myPojoClassObj = (MyPojoClass) objectBuilder.build(MyPojoClass.class);
