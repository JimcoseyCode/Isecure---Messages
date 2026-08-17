.class public final Lexpo/modules/kotlin/types/LazyKType;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC7/o;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000c\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0017\u001a\u0004\u0008\u0005\u0010\u0018R\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00018BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020&0!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010$\u00a8\u0006)"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/LazyKType;",
        "LC7/o;",
        "LC7/d;",
        "classifier",
        "",
        "isMarkedNullable",
        "Lkotlin/Function0;",
        "kTypeProvider",
        "<init>",
        "(LC7/d;ZLw7/a;)V",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "",
        "hashCode",
        "()I",
        "",
        "toString",
        "()Ljava/lang/String;",
        "LC7/d;",
        "getClassifier",
        "()LC7/d;",
        "Z",
        "()Z",
        "Lw7/a;",
        "getKTypeProvider",
        "()Lw7/a;",
        "_kType",
        "LC7/o;",
        "getKType",
        "()LC7/o;",
        "kType",
        "",
        "",
        "getAnnotations",
        "()Ljava/util/List;",
        "annotations",
        "LC7/q;",
        "getArguments",
        "arguments",
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
.field private _kType:LC7/o;

.field private final classifier:LC7/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LC7/d;"
        }
    .end annotation
.end field

.field private final isMarkedNullable:Z

.field private final kTypeProvider:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LC7/d;ZLw7/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC7/d;",
            "Z",
            "Lw7/a;",
            ")V"
        }
    .end annotation

    const-string v0, "classifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kTypeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/kotlin/types/LazyKType;->classifier:LC7/d;

    .line 3
    iput-boolean p2, p0, Lexpo/modules/kotlin/types/LazyKType;->isMarkedNullable:Z

    .line 4
    iput-object p3, p0, Lexpo/modules/kotlin/types/LazyKType;->kTypeProvider:Lw7/a;

    return-void
.end method

.method public synthetic constructor <init>(LC7/d;ZLw7/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    return-void
.end method

.method private final getKType()LC7/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/LazyKType;->_kType:LC7/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lexpo/modules/kotlin/types/LazyKType;->kTypeProvider:Lw7/a;

    .line 6
    .line 7
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LC7/o;

    .line 12
    .line 13
    iput-object v0, p0, Lexpo/modules/kotlin/types/LazyKType;->_kType:LC7/o;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lexpo/modules/kotlin/types/LazyKType;->_kType:LC7/o;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/kotlin/types/LazyKType;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-direct {p0}, Lexpo/modules/kotlin/types/LazyKType;->getKType()LC7/o;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_1
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/LazyKType;->getClassifier()LC7/d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast p1, Lexpo/modules/kotlin/types/LazyKType;

    .line 23
    .line 24
    invoke-virtual {p1}, Lexpo/modules/kotlin/types/LazyKType;->getClassifier()LC7/d;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/LazyKType;->isMarkedNullable()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {p1}, Lexpo/modules/kotlin/types/LazyKType;->isMarkedNullable()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-ne v1, p1, :cond_2

    .line 43
    .line 44
    return v0

    .line 45
    :cond_2
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/types/LazyKType;->getKType()LC7/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LC7/b;->getAnnotations()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getArguments()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LC7/q;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/types/LazyKType;->getKType()LC7/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LC7/o;->getArguments()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getClassifier()LC7/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LC7/d;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lexpo/modules/kotlin/types/LazyKType;->classifier:LC7/d;

    return-object v0
.end method

.method public bridge synthetic getClassifier()LC7/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/LazyKType;->getClassifier()LC7/d;

    move-result-object v0

    return-object v0
.end method

.method public final getKTypeProvider()Lw7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lw7/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/LazyKType;->kTypeProvider:Lw7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/LazyKType;->getClassifier()LC7/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LC7/d;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    invoke-virtual {p0}, Lexpo/modules/kotlin/types/LazyKType;->isMarkedNullable()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    add-int/2addr v0, v1

    .line 20
    return v0
.end method

.method public isMarkedNullable()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/types/LazyKType;->isMarkedNullable:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/types/LazyKType;->getKType()LC7/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
