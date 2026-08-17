.class final Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/kotlin/records/RecordTypeConverter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "PropertyDescriptor"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\u0008\u00030\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;",
        "",
        "typeConverter",
        "Lexpo/modules/kotlin/types/TypeConverter;",
        "fieldAnnotation",
        "Lexpo/modules/kotlin/records/Field;",
        "isRequired",
        "",
        "<init>",
        "(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;Z)V",
        "getTypeConverter",
        "()Lexpo/modules/kotlin/types/TypeConverter;",
        "getFieldAnnotation",
        "()Lexpo/modules/kotlin/records/Field;",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final fieldAnnotation:Lexpo/modules/kotlin/records/Field;

.field private final isRequired:Z

.field private final typeConverter:Lexpo/modules/kotlin/types/TypeConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;",
            "Lexpo/modules/kotlin/records/Field;",
            "Z)V"
        }
    .end annotation

    .line 1
    const-string v0, "typeConverter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fieldAnnotation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 17
    .line 18
    iput-boolean p3, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;ZILjava/lang/Object;)Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 8
    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_2

    .line 16
    .line 17
    iget-boolean p3, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 18
    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->copy(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;Z)Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final component1()Lexpo/modules/kotlin/types/TypeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Lexpo/modules/kotlin/records/Field;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 2
    .line 3
    return v0
.end method

.method public final copy(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;Z)Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;",
            "Lexpo/modules/kotlin/records/Field;",
            "Z)",
            "Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;"
        }
    .end annotation

    .line 1
    const-string v0, "typeConverter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fieldAnnotation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;-><init>(Lexpo/modules/kotlin/types/TypeConverter;Lexpo/modules/kotlin/records/Field;Z)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 25
    .line 26
    iget-object v3, p1, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-boolean v1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 36
    .line 37
    iget-boolean p1, p1, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 38
    .line 39
    if-eq v1, p1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    return v0
.end method

.method public final getFieldAnnotation()Lexpo/modules/kotlin/records/Field;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTypeConverter()Lexpo/modules/kotlin/types/TypeConverter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/types/TypeConverter<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-boolean v1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    return v0
.end method

.method public final isRequired()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->typeConverter:Lexpo/modules/kotlin/types/TypeConverter;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->fieldAnnotation:Lexpo/modules/kotlin/records/Field;

    .line 4
    .line 5
    iget-boolean v2, p0, Lexpo/modules/kotlin/records/RecordTypeConverter$PropertyDescriptor;->isRequired:Z

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v4, "PropertyDescriptor(typeConverter="

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v0, ", fieldAnnotation="

    .line 21
    .line 22
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v0, ", isRequired="

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ")"

    .line 37
    .line 38
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method
