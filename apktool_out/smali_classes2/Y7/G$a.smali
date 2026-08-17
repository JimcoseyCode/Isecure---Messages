.class final LY7/G$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY7/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lk8/f;

.field private final b:Lb8/g;


# direct methods
.method public constructor <init>(Lk8/f;Lb8/g;)V
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
    iput-object p1, p0, LY7/G$a;->a:Lk8/f;

    .line 10
    .line 11
    iput-object p2, p0, LY7/G$a;->b:Lb8/g;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Lb8/g;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/G$a;->b:Lb8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lk8/f;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/G$a;->a:Lk8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LY7/G$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY7/G$a;->a:Lk8/f;

    .line 6
    .line 7
    check-cast p1, LY7/G$a;

    .line 8
    .line 9
    iget-object p1, p1, LY7/G$a;->a:Lk8/f;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LY7/G$a;->a:Lk8/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk8/f;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
