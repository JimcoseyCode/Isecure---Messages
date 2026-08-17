.class public final synthetic Ld4/q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lf4/b$a;


# instance fields
.field public final synthetic a:Ld4/r;

.field public final synthetic b:LW3/o;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ld4/r;LW3/o;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld4/q;->a:Ld4/r;

    .line 5
    .line 6
    iput-object p2, p0, Ld4/q;->b:LW3/o;

    .line 7
    .line 8
    iput-wide p3, p0, Ld4/q;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final execute()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Ld4/q;->a:Ld4/r;

    .line 2
    .line 3
    iget-object v1, p0, Ld4/q;->b:LW3/o;

    .line 4
    .line 5
    iget-wide v2, p0, Ld4/q;->c:J

    .line 6
    .line 7
    invoke-static {v0, v1, v2, v3}, Ld4/r;->g(Ld4/r;LW3/o;J)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
