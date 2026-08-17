.class public interface abstract Lexpo/modules/interfaces/taskManager/TaskInterface;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# virtual methods
.method public abstract execute(Landroid/os/Bundle;Ljava/lang/Error;)V
.end method

.method public abstract execute(Landroid/os/Bundle;Ljava/lang/Error;Lexpo/modules/interfaces/taskManager/TaskExecutionCallback;)V
.end method

.method public abstract getAppScopeKey()Ljava/lang/String;
.end method

.method public abstract getAppUrl()Ljava/lang/String;
.end method

.method public abstract getConsumer()Lexpo/modules/interfaces/taskManager/TaskConsumerInterface;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getOptions()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getOptionsBundle()Landroid/os/Bundle;
.end method

.method public abstract setOptions(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation
.end method
