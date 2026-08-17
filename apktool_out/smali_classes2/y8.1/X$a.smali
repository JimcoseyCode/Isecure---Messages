.class final synthetic Ly8/X$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/X;->y(Ly8/X;Lf8/q;I)LL7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final g:Ly8/X$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly8/X$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ly8/X$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly8/X$a;->g:Ly8/X$a;

    .line 7
    .line 8
    return-void
.end method

.method synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlin/jvm/internal/u;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lk8/b;

    .line 2
    .line 3
    invoke-virtual {p1}, Lk8/b;->e()Lk8/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "outerClassId"

    .line 2
    .line 3
    return-object v0
.end method

.method public getOwner()LC7/f;
    .locals 1

    .line 1
    const-class v0, Lk8/b;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;"

    .line 2
    .line 3
    return-object v0
.end method
