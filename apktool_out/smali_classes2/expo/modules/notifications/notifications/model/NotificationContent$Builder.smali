.class public Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/notifications/notifications/model/NotificationContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private final content:Lexpo/modules/notifications/notifications/model/NotificationContent;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 5
    .line 6
    invoke-direct {v0}, Lexpo/modules/notifications/notifications/model/NotificationContent;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 10
    .line 11
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->useDefaultSound()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->useDefaultVibrationPattern()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public build()Lexpo/modules/notifications/notifications/model/NotificationContent;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    return-object v0
.end method

.method disableVibrations()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->h(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->p(Lexpo/modules/notifications/notifications/model/NotificationContent;[J)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setAutoDismiss(Z)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->a(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setBadgeCount(Ljava/lang/Number;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->b(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setBody(Lorg/json/JSONObject;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->c(Lexpo/modules/notifications/notifications/model/NotificationContent;Lorg/json/JSONObject;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setCategoryId(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->d(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setColor(Ljava/lang/Number;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->e(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/Number;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setPriority(Lexpo/modules/notifications/notifications/enums/NotificationPriority;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->f(Lexpo/modules/notifications/notifications/model/NotificationContent;Lexpo/modules/notifications/notifications/enums/NotificationPriority;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setSound(Landroid/net/Uri;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->g(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->i(Lexpo/modules/notifications/notifications/model/NotificationContent;Landroid/net/Uri;)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setSticky(Z)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->j(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setSubtitle(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->l(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setText(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->n(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->o(Lexpo/modules/notifications/notifications/model/NotificationContent;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setVibrationPattern([J)Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->h(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->p(Lexpo/modules/notifications/notifications/model/NotificationContent;[J)V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public useDefaultSound()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->g(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->i(Lexpo/modules/notifications/notifications/model/NotificationContent;Landroid/net/Uri;)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public useDefaultVibrationPattern()Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->h(Lexpo/modules/notifications/notifications/model/NotificationContent;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lexpo/modules/notifications/notifications/model/NotificationContent$Builder;->content:Lexpo/modules/notifications/notifications/model/NotificationContent;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Lexpo/modules/notifications/notifications/model/NotificationContent;->p(Lexpo/modules/notifications/notifications/model/NotificationContent;[J)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
