.class Lo1/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lo1/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/f;->f(Lo1/d;Ljava/util/concurrent/Executor;Lo1/c;)Lo1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo1/g;

.field final synthetic b:Lo1/d;

.field final synthetic c:Ljava/util/concurrent/Executor;

.field final synthetic d:Lo1/f;


# direct methods
.method constructor <init>(Lo1/f;Lo1/g;Lo1/d;Ljava/util/concurrent/Executor;Lo1/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo1/f$a;->d:Lo1/f;

    .line 2
    .line 3
    iput-object p2, p0, Lo1/f$a;->a:Lo1/g;

    .line 4
    .line 5
    iput-object p3, p0, Lo1/f$a;->b:Lo1/d;

    .line 6
    .line 7
    iput-object p4, p0, Lo1/f$a;->c:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lo1/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lo1/f$a;->b(Lo1/f;)Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Lo1/f;)Ljava/lang/Void;
    .locals 4

    .line 1
    iget-object v0, p0, Lo1/f$a;->a:Lo1/g;

    .line 2
    .line 3
    iget-object v1, p0, Lo1/f$a;->b:Lo1/d;

    .line 4
    .line 5
    iget-object v2, p0, Lo1/f$a;->c:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v1, p1, v2, v3}, Lo1/f;->a(Lo1/g;Lo1/d;Lo1/f;Ljava/util/concurrent/Executor;Lo1/c;)V

    .line 9
    .line 10
    .line 11
    return-object v3
.end method
