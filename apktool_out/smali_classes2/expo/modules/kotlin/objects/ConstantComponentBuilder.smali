.class public Lexpo/modules/kotlin/objects/ConstantComponentBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u0000\"\u0006\u0008\u0000\u0010\u0006\u0018\u00012\u000e\u0008\u0004\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R,\u0010\u0011\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0017"
    }
    d2 = {
        "Lexpo/modules/kotlin/objects/ConstantComponentBuilder;",
        "",
        "",
        "name",
        "<init>",
        "(Ljava/lang/String;)V",
        "R",
        "Lkotlin/Function0;",
        "body",
        "get",
        "(Lw7/a;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;",
        "Lexpo/modules/kotlin/objects/ConstantComponent;",
        "build",
        "()Lexpo/modules/kotlin/objects/ConstantComponent;",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "getter",
        "Lw7/a;",
        "getGetter",
        "()Lw7/a;",
        "setGetter",
        "(Lw7/a;)V",
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
.field private getter:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/kotlin/objects/ConstantComponentBuilder;->name:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final build()Lexpo/modules/kotlin/objects/ConstantComponent;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/ConstantComponentBuilder;->name:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/objects/ConstantComponentBuilder;->getter:Lw7/a;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Lexpo/modules/kotlin/objects/ConstantComponent;

    .line 8
    .line 9
    invoke-direct {v2, v0, v1}, Lexpo/modules/kotlin/objects/ConstantComponent;-><init>(Ljava/lang/String;Lw7/a;)V

    .line 10
    .line 11
    .line 12
    return-object v2

    .line 13
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "The constant \'"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, "\' doesn\'t have getter."

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1
.end method

.method public final synthetic get(Lw7/a;)Lexpo/modules/kotlin/objects/ConstantComponentBuilder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/a;",
            ")",
            "Lexpo/modules/kotlin/objects/ConstantComponentBuilder;"
        }
    .end annotation

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lexpo/modules/kotlin/objects/ConstantComponentBuilder$get$1$1;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lexpo/modules/kotlin/objects/ConstantComponentBuilder$get$1$1;-><init>(Lw7/a;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/objects/ConstantComponentBuilder;->setGetter(Lw7/a;)V

    .line 15
    .line 16
    .line 17
    return-object p0
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
    iget-object v0, p0, Lexpo/modules/kotlin/objects/ConstantComponentBuilder;->getter:Lw7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/ConstantComponentBuilder;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setGetter(Lw7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/objects/ConstantComponentBuilder;->getter:Lw7/a;

    .line 2
    .line 3
    return-void
.end method
