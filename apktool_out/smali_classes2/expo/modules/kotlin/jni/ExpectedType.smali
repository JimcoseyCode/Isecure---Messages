.class public final Lexpo/modules/kotlin/jni/ExpectedType;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/jni/ExpectedType$Companion;
    }
.end annotation

.annotation build Lexpo/modules/core/interfaces/DoNotStrip;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u001d\u0008\u0016\u0012\u0012\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00080\u0003\"\u00020\u0008\u00a2\u0006\u0004\u0008\u0005\u0010\tJ\u0008\u0010\r\u001a\u00020\u000cH\u0007J\u0015\u0010\u000e\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003H\u0007\u00a2\u0006\u0002\u0010\u000fJ\u0008\u0010\u0010\u001a\u00020\u0004H\u0007J\u0008\u0010\u0011\u001a\u00020\u000cH\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0018\u0010\u0002\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/kotlin/jni/ExpectedType;",
        "",
        "innerPossibleTypes",
        "",
        "Lexpo/modules/kotlin/jni/SingleType;",
        "<init>",
        "([Lexpo/modules/kotlin/jni/SingleType;)V",
        "expectedTypes",
        "Lexpo/modules/kotlin/jni/CppType;",
        "([Lexpo/modules/kotlin/jni/CppType;)V",
        "[Lexpo/modules/kotlin/jni/SingleType;",
        "innerCombinedTypes",
        "",
        "getCombinedTypes",
        "getPossibleTypes",
        "()[Lexpo/modules/kotlin/jni/SingleType;",
        "getFirstType",
        "hashCode",
        "equals",
        "",
        "other",
        "Companion",
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


# static fields
.field public static final Companion:Lexpo/modules/kotlin/jni/ExpectedType$Companion;


# instance fields
.field private final innerCombinedTypes:I

.field private final innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/kotlin/jni/ExpectedType$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/jni/ExpectedType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/kotlin/jni/ExpectedType;->Companion:Lexpo/modules/kotlin/jni/ExpectedType$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public varargs constructor <init>([Lexpo/modules/kotlin/jni/CppType;)V
    .locals 8

    const-string v0, "expectedTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    .line 7
    new-instance v5, Lexpo/modules/kotlin/jni/SingleType;

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-direct {v5, v4, v7, v6, v7}, Lexpo/modules/kotlin/jni/SingleType;-><init>(Lexpo/modules/kotlin/jni/CppType;[Lexpo/modules/kotlin/jni/ExpectedType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 9
    :cond_0
    new-array p1, v2, [Lexpo/modules/kotlin/jni/SingleType;

    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 10
    check-cast p1, [Lexpo/modules/kotlin/jni/SingleType;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lexpo/modules/kotlin/jni/SingleType;

    invoke-direct {p0, p1}, Lexpo/modules/kotlin/jni/ExpectedType;-><init>([Lexpo/modules/kotlin/jni/SingleType;)V

    return-void
.end method

.method public varargs constructor <init>([Lexpo/modules/kotlin/jni/SingleType;)V
    .locals 4

    const-string v0, "innerPossibleTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v3, p1, v1

    .line 4
    invoke-virtual {v3}, Lexpo/modules/kotlin/jni/SingleType;->getCppType()I

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v2, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerCombinedTypes:I

    return-void
.end method

.method public static final synthetic access$getInnerPossibleTypes$p(Lexpo/modules/kotlin/jni/ExpectedType;)[Lexpo/modules/kotlin/jni/SingleType;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    instance-of v0, p1, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 8
    .line 9
    array-length v2, v0

    .line 10
    check-cast p1, Lexpo/modules/kotlin/jni/ExpectedType;

    .line 11
    .line 12
    iget-object v3, p1, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 13
    .line 14
    array-length v3, v3

    .line 15
    if-eq v2, v3, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    array-length v0, v0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    if-ge v2, v0, :cond_4

    .line 21
    .line 22
    iget-object v3, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 23
    .line 24
    aget-object v3, v3, v2

    .line 25
    .line 26
    invoke-virtual {v3}, Lexpo/modules/kotlin/jni/SingleType;->getExpectedCppType$expo_modules_core_release()Lexpo/modules/kotlin/jni/CppType;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    iget-object v4, p1, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 31
    .line 32
    aget-object v4, v4, v2

    .line 33
    .line 34
    invoke-virtual {v4}, Lexpo/modules/kotlin/jni/SingleType;->getExpectedCppType$expo_modules_core_release()Lexpo/modules/kotlin/jni/CppType;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    if-eq v3, v4, :cond_2

    .line 39
    .line 40
    return v1

    .line 41
    :cond_2
    iget-object v3, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 42
    .line 43
    aget-object v3, v3, v2

    .line 44
    .line 45
    iget-object v4, p1, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 46
    .line 47
    aget-object v4, v4, v2

    .line 48
    .line 49
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    return v1

    .line 56
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    const/4 p1, 0x1

    .line 60
    return p1
.end method

.method public final getCombinedTypes()I
    .locals 1
    .annotation build Lexpo/modules/core/interfaces/DoNotStrip;
    .end annotation

    .line 1
    iget v0, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerCombinedTypes:I

    .line 2
    .line 3
    return v0
.end method

.method public final getFirstType()Lexpo/modules/kotlin/jni/SingleType;
    .locals 1
    .annotation build Lexpo/modules/core/interfaces/DoNotStrip;
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 2
    .line 3
    invoke-static {v0}, Lj7/j;->F([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lexpo/modules/kotlin/jni/SingleType;

    .line 8
    .line 9
    return-object v0
.end method

.method public final getPossibleTypes()[Lexpo/modules/kotlin/jni/SingleType;
    .locals 1
    .annotation build Lexpo/modules/core/interfaces/DoNotStrip;
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerCombinedTypes:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/kotlin/jni/ExpectedType;->innerPossibleTypes:[Lexpo/modules/kotlin/jni/SingleType;

    .line 6
    .line 7
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    return v0
.end method
