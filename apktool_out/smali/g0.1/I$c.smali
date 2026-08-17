.class Lg0/I$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lg0/p0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/I;->f0(Lg0/p0;Ln/a;)Lg0/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln/a;

.field final synthetic b:Lg0/p0;


# direct methods
.method constructor <init>(Ln/a;Lg0/p0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0/I$c;->a:Ln/a;

    .line 2
    .line 3
    iput-object p2, p0, Lg0/I$c;->b:Lg0/p0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()J
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/I$c;->a:Ln/a;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/I$c;->b:Lg0/p0;

    .line 4
    .line 5
    invoke-interface {v1}, Lg0/p0;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ln/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0
.end method

.method public b()J
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/I$c;->a:Ln/a;

    .line 2
    .line 3
    iget-object v1, p0, Lg0/I$c;->b:Lg0/p0;

    .line 4
    .line 5
    invoke-interface {v1}, Lg0/p0;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ln/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Long;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    return-wide v0
.end method
