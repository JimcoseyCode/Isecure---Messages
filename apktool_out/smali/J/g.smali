.class public final synthetic LJ/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lm5/a;

.field public final synthetic b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(Lm5/a;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ/g;->a:Lm5/a;

    .line 5
    .line 6
    iput-object p2, p0, LJ/g;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    iput-object p3, p0, LJ/g;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p4, p0, LJ/g;->d:Z

    .line 11
    .line 12
    iput-wide p5, p0, LJ/g;->e:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LJ/g;->a:Lm5/a;

    .line 2
    .line 3
    iget-object v1, p0, LJ/g;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    iget-object v2, p0, LJ/g;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-boolean v3, p0, LJ/g;->d:Z

    .line 8
    .line 9
    iget-wide v4, p0, LJ/g;->e:J

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    invoke-static/range {v0 .. v6}, LJ/n;->a(Lm5/a;Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZJLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
