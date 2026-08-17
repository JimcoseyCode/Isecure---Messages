.class public final Lexpo/modules/kotlin/objects/ConstantComponent;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lexpo/modules/kotlin/objects/ConstantComponent;",
        "",
        "",
        "name",
        "Lkotlin/Function0;",
        "getter",
        "<init>",
        "(Ljava/lang/String;Lw7/a;)V",
        "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;",
        "jsObject",
        "Li7/B;",
        "attachToJSObject",
        "(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "Lw7/a;",
        "getGetter",
        "()Lw7/a;",
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
.field private final getter:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "getter"

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
    iput-object p1, p0, Lexpo/modules/kotlin/objects/ConstantComponent;->name:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/kotlin/objects/ConstantComponent;->getter:Lw7/a;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lexpo/modules/kotlin/objects/ConstantComponent;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/kotlin/objects/ConstantComponent;->attachToJSObject$lambda$0(Lexpo/modules/kotlin/objects/ConstantComponent;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final attachToJSObject$lambda$0(Lexpo/modules/kotlin/objects/ConstantComponent;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p0, p0, Lexpo/modules/kotlin/objects/ConstantComponent;->getter:Lw7/a;

    .line 2
    .line 3
    invoke-interface {p0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v0, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->INSTANCE:Lexpo/modules/kotlin/types/JSTypeConverterProvider;

    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static/range {v0 .. v5}, Lexpo/modules/kotlin/types/JSTypeConverterProvider;->convertToJSValue$default(Lexpo/modules/kotlin/types/JSTypeConverterProvider;Ljava/lang/Object;Lexpo/modules/kotlin/types/JSTypeConverterProvider$ContainerProvider;ZILjava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final attachToJSObject(Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;)V
    .locals 2

    .line 1
    const-string v0, "jsObject"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/kotlin/objects/a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lexpo/modules/kotlin/objects/a;-><init>(Lexpo/modules/kotlin/objects/ConstantComponent;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lexpo/modules/kotlin/objects/ConstantComponent;->name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0}, Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;->registerConstant(Ljava/lang/String;Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final getGetter()Lw7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw7/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/ConstantComponent;->getter:Lw7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/ConstantComponent;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
