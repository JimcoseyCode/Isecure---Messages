.class public final synthetic Le7/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Ljava/lang/StringBuilder;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/os/Bundle;Ljava/lang/StringBuilder;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le7/a;->a:Landroid/os/Bundle;

    .line 5
    .line 6
    iput-object p2, p0, Le7/a;->b:Ljava/lang/StringBuilder;

    .line 7
    .line 8
    iput p3, p0, Le7/a;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Le7/a;->d:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Le7/a;->a:Landroid/os/Bundle;

    .line 2
    .line 3
    iget-object v1, p0, Le7/a;->b:Ljava/lang/StringBuilder;

    .line 4
    .line 5
    iget v2, p0, Le7/a;->c:I

    .line 6
    .line 7
    iget-object v3, p0, Le7/a;->d:Ljava/lang/String;

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, p1}, Lexpo/modules/notifications/notifications/debug/DebugLogging;->a(Landroid/os/Bundle;Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
