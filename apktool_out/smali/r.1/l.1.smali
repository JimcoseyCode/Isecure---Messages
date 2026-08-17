.class public final synthetic Lr/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lr/y;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lr/y;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/l;->a:Lr/y;

    .line 5
    .line 6
    iput-wide p2, p0, Lr/l;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lr/l;->a:Lr/y;

    .line 2
    .line 3
    iget-wide v1, p0, Lr/l;->b:J

    .line 4
    .line 5
    invoke-static {v0, v1, v2, p1}, Lr/y;->v(Lr/y;JLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
